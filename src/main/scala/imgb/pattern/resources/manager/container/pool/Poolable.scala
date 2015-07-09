package imgb.pattern.resources.manager.container.pool

import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 7/9/15.
 */
trait Poolable extends Resource{
  def beAvaiable:Boolean
  def occupy:Poolable
}
