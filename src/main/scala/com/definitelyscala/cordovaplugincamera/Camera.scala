package com.definitelyscala.cordovaplugincamera

import scala.scalajs.js

@js.native
trait Camera extends js.Object {
  /**
   * Removes intermediate photos taken by the camera from temporary storage.
   * @param onSuccess Success callback, that called when cleanup succeeds.
   * @param onError Error callback, that get an error message.
   */
  def cleanup(onSuccess: js.Function0[Unit], onError: js.Function1[String, Unit]): Unit = js.native
  /**
   * Takes a photo using the camera, or retrieves a photo from the device's image gallery.
   * @param cameraSuccess Success callback, that get the image
   * as a base64-encoded String, or as the URI for the image file.
   * @param cameraError Error callback, that get an error message.
   * @param cameraOptions Optional parameters to customize the camera settings.
   */
  def getPicture(cameraSuccess: js.Function1[String, Unit], cameraError: js.Function1[String, Unit], cameraOptions: CameraOptions = js.native): Unit = js.native
}

@js.native
@js.annotation.JSGlobal("Camera")
object Camera extends js.Object {
  // Camera constants, defined in Camera plugin
  var DestinationType: js.Any = js.native
  var Direction: js.Any = js.native
  var EncodingType: js.Any = js.native
  var MediaType: js.Any = js.native
  var PictureSourceType: js.Any = js.native
  // Used only on iOS
  var PopoverArrowDirection: js.Any = js.native
}