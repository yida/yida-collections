DESCRIPTION = "ROS driver for devices supporting the IEEE 1394 Digital Camera (IIDC) protocol."
HOMEPAGE = "http://www.ros.org/wiki/camera1394"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "libdc1394 ros-fuerte-gumstix ros-fuerte-camera-info-manager \
            ros-fuerte-driver-base \
            ros-fuerte-nodelet \
            ros-fuerte-tf \
            ros-fuerte-image-transport \
            ros-fuerte-diagnostic-updater"

SRCREV = "40248"
PR = "r5"
SETNAME = ""
SRCNAME="camera1394"

inherit stacks 
SRC_URI = "svn://code.ros.org/svn/ros-pkg/stacks/camera1394;module=trunk;proto=https \
           file://BSD-Willow.txt"


cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/trunk/* ${WORKDIR}/source/${SETNAME}/${SRCNAME}/.
}

do_install_append() {
  stacks_do_file_install camera1394_nodelet.xml
}
