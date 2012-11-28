DESCRIPTION = "Common code for working with images in ROS"
HOMEPAGE = "http://www.ros.org/wiki/image_common?distro=fuerte"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"
SRCREV = "40258"
PR = "r0"

inherit stacks

SRC_URI = "svn://code.ros.org/svn/ros-pkg/stacks/image_common;module=trunk;proto=https \
           file://BSD-Willow.txt"

SETNAME = "image_common"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/trunk/* ${WORKDIR}/source/${SETNAME}/.
}
