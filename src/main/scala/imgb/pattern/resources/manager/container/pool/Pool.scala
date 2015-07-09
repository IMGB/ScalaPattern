package imgb.pattern.resources.manager.container.pool

import imgb.pattern.resources.manager.container.Container
import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 7/8/15.
 */
trait Pool[R <: Poolable] extends Container[R] {
  def acquire(): Option[R]
}
