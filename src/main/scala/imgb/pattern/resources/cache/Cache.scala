package imgb.pattern.resources.cache

import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 7/8/15.
 */
abstract class Cache[T <: Resource with Cacheable] {

  def cache(resource: T):T

  def release(resource: T):T
}
