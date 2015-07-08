package imgb.pattern.resources.center

import imgb.pattern.resources.center.tag.ResourceTag
import imgb.pattern.resources.manager.ResourceManager
import imgb.pattern.resources.resource.Resource

/**
 * Created by xyz on 6/29/15.
 */
abstract class ResourcesCenter[R <:Resource] {
  def register(provider: ResourceManager[R], resourceTag: ResourceTag)
  def remove(resourceProvider: ResourceManager[R])

}
