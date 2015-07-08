package imgb.pattern.resources.resource

/**
 * Created by xyz on 7/8/15.
 */
trait DisposalReflectionManager extends ProxyResourceManager{
  protected def beforeDisposal(rm: ManagerType,resource: ResourceType):ResourceType = resource
  protected def afterDisposal(rm: ManagerType,resource: ResourceType):ResourceType = resource

  abstract override def dispose(resource: ResourceType): ResourceType = {
    afterDisposal(resourceManager,
      super.dispose(
        beforeDisposal(resourceManager,resource)
      )
    )
  }
}
