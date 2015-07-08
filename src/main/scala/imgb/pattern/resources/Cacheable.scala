package imgb.pattern.resources

/**
 * Created by xyz on 7/8/15.
 */
trait Cacheable {
  def cacheId:Long = this.hashCode()
}
