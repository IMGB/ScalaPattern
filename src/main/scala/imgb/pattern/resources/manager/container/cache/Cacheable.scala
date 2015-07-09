package imgb.pattern.resources.manager.container.cache

import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 7/8/15.
 */
trait Cacheable extends Resource {
  def cacheId: Long = this.hashCode()
}
