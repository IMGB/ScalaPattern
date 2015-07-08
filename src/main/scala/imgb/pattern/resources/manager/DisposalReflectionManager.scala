package imgb.pattern.resources.manager

import imgb.pattern.resources.resource.Resource


/**
 * Created by xyz on 7/8/15.
 */
trait DisposalReflectionManager[R<:Resource] extends ProxyResourceManager[R]{
  protected def beforeDisposal(rm: ManagerType,resource: R):R = resource
  protected def afterDisposal(rm: ManagerType,resource: R):R = resource

  abstract override def dispose(resource: R): R = {
    afterDisposal(resourceManager,
      super.dispose(
        beforeDisposal(resourceManager,resource)
      )
    )
  }
}
