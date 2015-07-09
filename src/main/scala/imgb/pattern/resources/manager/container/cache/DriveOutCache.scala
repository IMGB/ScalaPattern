package imgb.pattern.resources.manager.container.cache

/**
 * Created by xyz on 7/9/15.
 */
trait DriveOutCache[R <: Cacheable] extends Cache[R]{
  protected def overCapacity(resource:R):Boolean
  protected def driveOut(inputResource:R): Option[R] = None
  
  abstract override def input(resource: R): Option[R] = {
    if(overCapacity(resource)) {
      driveOut(resource)
    }
    super.input(resource)
  }
}
