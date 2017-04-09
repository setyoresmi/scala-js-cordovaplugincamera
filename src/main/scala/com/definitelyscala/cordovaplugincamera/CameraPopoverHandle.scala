package com.definitelyscala.cordovaplugincamera

import scala.scalajs.js

@js.native
trait CameraPopoverHandle extends js.Object {
  /**
   * Set the position of the popover.
   * @param popoverOptions the CameraPopoverOptions that specify the new position.
   */
  def setPosition(popoverOptions: CameraPopoverOptions): Unit = js.native
}