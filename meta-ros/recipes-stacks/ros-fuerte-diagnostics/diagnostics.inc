DESCRIPTION = "Packages related to gathering, viewing, and analyzing diagnostics data from robots"
HOMEPAGE = "http://www.ros.org/wiki/diagnostics?distro=fuerte"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"
SRCREV = "40260"
PR = "r0"

inherit stacks

SRC_URI = "svn://code.ros.org/svn/ros-pkg/stacks/diagnostics;module=trunk;proto=https \
           file://BSD-Willow.txt"

SETNAME = "diagnostics"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/trunk/* ${WORKDIR}/${SETNAME}/.
}
