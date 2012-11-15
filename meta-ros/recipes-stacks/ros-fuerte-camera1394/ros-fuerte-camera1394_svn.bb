DESCRIPTION = "ROS driver for devices supporting the IEEE 1394 Digital Camera (IIDC) protocol."
HOMEPAGE = "http://www.ros.org/wiki/camera1394"
LICENSE = "BSD,LGPL"
LIC_FILES_CHKSUM = "file://../BSD-Willow.txt;md5=1a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "libdc1394 ros-fuerte-gumstix ros-fuerte-camera-info-manager"

SRCREV = "40248"
PR = "r1"
SETNAME = ""
SRCNAME="camera1394"

inherit stacks 
SRC_URI = "svn://code.ros.org/svn/ros-pkg/stacks/camera1394;module=trunk;proto=https \
           file://BSD-Willow.txt"

S = "${WORKDIR}/${SETNAME}/${SRCNAME}"



cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/trunk/* ${WORKDIR}/${SETNAME}/${SRCNAME}/.
}
