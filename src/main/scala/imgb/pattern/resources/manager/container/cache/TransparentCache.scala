package imgb.pattern.resources.manager.container.cache

import imgb.pattern.resources.manager.ResourceManager

/**
 * Created by xyz on 7/8/15.
 */
trait TransparentCache[R <: Cacheable] extends Cache[R] {
  type ManagerType <: ResourceManager[R]

  protected def getResourceManager(resourceId: Long): ManagerType

  protected def reAcquire(resourceId: Long): Option[R] = {
    this.input(getResourceManager(resourceId).acquire())
    this.acquire(resourceId)
  }

  abstract override def acquire(resourceId: Long): Option[R] = {
    try {
      super.acquire(resourceId) match {
        case Some(x) => Option(x)
        case _ => reAcquire(resourceId)
      }
    } catch {
      case ex: NullPointerException => None
    }
  }
}
