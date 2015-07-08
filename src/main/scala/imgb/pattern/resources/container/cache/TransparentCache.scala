package imgb.pattern.resources.container.cache

import imgb.pattern.resources.manager.ResourceManager

/**
 * Created by xyz on 7/8/15.
 */
trait TransparentCache[R <: Cacheable] extends Cache[R] {
  type ManagerType <: ResourceManager[R]

  protected def getResourceManager(resourceId: Long): ManagerType

  protected def reAcquire(resourceId:Long):R ={
      this.release(getResourceManager(resourceId).acquire())
  }

  abstract override def acquire(resourceId: Long): Option[R] = {
    try {
      super.acquire(resourceId) match {
        case Some(x) => Option(x)
        case _ => Option(reAcquire(resourceId))
      }
    } catch {
      case ex: NullPointerException => None
    }
  }
}
