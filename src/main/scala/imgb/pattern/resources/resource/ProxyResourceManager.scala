package imgb.pattern.resources.resource

/**
 * Created by xyz on 7/8/15.
 */
trait ProxyResourceManager extends ResourceManager{
  protected def resourceManager:ManagerType
  type ManagerType <:ResourceManager

  override def acquire(): ResourceType = resourceManager.acquire()

  override def dispose(resource: ResourceType): ResourceType = resourceManager.dispose(resource: ResourceType)
}
