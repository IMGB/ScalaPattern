package imgb.pattern.resources

import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 7/8/15.
 */
trait Cache {
  type ResourceType <: Resource with Cacheable

  def cache(resource: ResourceType)

  def release(resource: ResourceType)
}
