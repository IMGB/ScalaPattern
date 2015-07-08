package imgb.pattern.resources.container.cache

import imgb.pattern.resources.container.Container

/**
 * Created by xyz on 7/8/15.
 */
trait Cache[R <: Cacheable] extends Container[R]{

  def acquire(resourceId: Long):Option[R]

}
