package imgb.pattern.resources.manager.container.cache

import imgb.pattern.resources.manager.container.Container

/**
 * Created by xyz on 7/8/15.
 */
trait Cache[R <: Cacheable] extends Container[R] {
  def acquire(resourceId: Long): Option[R]


}
