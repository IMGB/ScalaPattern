package imgb.pattern.resources.container.pool

import imgb.pattern.resources.container.Container
import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 7/8/15.
 */
trait Pool[R<:Resource] extends Container[R]{
  def acquire():Option[R]
}
