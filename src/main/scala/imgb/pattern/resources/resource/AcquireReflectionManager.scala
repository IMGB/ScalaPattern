package imgb.pattern.resources.resource

/**
 * Created by xyz on 6/29/15.
 */
trait AcquireReflectionManager extends ProxyResourceManager{
  
  protected def beforeAcquire(resourceManager: ManagerType)
  protected def afterAcquire(resourceManager: ManagerType)

  abstract override def acquire(): ResourceType = {
    beforeAcquire(resourceManager)
    val resource:ResourceType = super.acquire()
    afterAcquire(resourceManager)
    resource
  }
}
