package imgb.pattern.resources.resource

/**
 * Created by xyz on 6/29/15.
 */
trait ResourceManager {
  protected type ResourceType <: Resource

  def acquire():ResourceType

  def dispose(resource: ResourceType):ResourceType

}
