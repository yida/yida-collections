DESCRIPTION = "The driver_common stack contains classes and tools that are useful throughout the driver stacks"
HOMEPAGE = "http://ros.org/wiki/driver_common?distro=fuerte"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"
SRCREV = "40260"
PR = "r1"

inherit stacks

SRC_URI = "svn://code.ros.org/svn/ros-pkg/stacks/driver_common;module=trunk;proto=https \
           file://BSD-Willow.txt"

SETNAME = "driver_common"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/trunk/* ${WORKDIR}/source/${SETNAME}/.
}
