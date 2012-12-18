DESCRIPTION = "This stack contains drivers for laser rangefinders, including Hokuyo SCIP 2.0-compliant and SICK models."
HOMEPAGE = "http://www.ros.org/wiki/image_common?distro=fuerte"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"
SRCREV = "40307"
PR = "r0"

inherit stacks

SRC_URI = "svn://code.ros.org/svn/ros-pkg/stacks/laser_drivers;module=trunk;proto=https \
           file://BSD-Willow.txt"

SETNAME = "laser_drivers"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/trunk/* ${WORKDIR}/source/${SETNAME}/.
}
