package imgb.pattern.resources.center

import imgb.pattern.resources.resource.ResourceManager
import imgb.pattern.resources.resource.tag.ResourceTag

/**
 * Created by xyz on 6/29/15.
 */
abstract class ResourcesCenter {
  def register(provider: ResourceManager, resourceTag: ResourceTag)

  def remove(resourceProvider: ResourceManager)

}
