package imgb.pattern.resources.manager

import imgb.pattern.resources.resource.Resource


/**
 * Created by xyz on 6/29/15.
 */
trait AcquireReflectionManager[R<:Resource] extends ProxyResourceManager[R]{
  
  protected def beforeAcquire(resourceManager: ManagerType)
  protected def afterAcquire(resourceManager: ManagerType)

  abstract override def acquire():R  = {
    beforeAcquire(resourceManager)
    val resource:R = super.acquire()
    afterAcquire(resourceManager)
    resource
  }
}
