package imgb.pattern.resources.cache

/**
 * Created by xyz on 7/8/15.
 */
trait Cacheable {
  def cacheId:Long = this.hashCode()
}
