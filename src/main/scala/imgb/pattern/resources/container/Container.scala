package imgb.pattern.resources.container

import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 7/8/15.
 */
trait Container[R <: Resource] {
  def release(resource: R):R
}
