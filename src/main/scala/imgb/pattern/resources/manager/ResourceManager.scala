package imgb.pattern.resources.manager

import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 6/29/15.
 */
trait ResourceManager[R <: Resource] {
  def acquire():R
  def dispose(resource: R):R
}
