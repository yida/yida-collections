DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins using the ROS build infrastructure."
HOMEPAGE = "http://ros.org/wiki/pluginlib"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native \
            tinyxml"

SRCREV = ""
PR = "r0"
SETNAME = ""
SRCNAME="pluginlib"

inherit stacks 

SRC_URI = "https://code.ros.org/svn/release/download/stacks/pluginlib/pluginlib-1.8.0/pluginlib-${PV}.tar.bz2 \
           file://BSD-Willow.txt"
SRC_URI[md5sum] = "ebd690f6ef36de49140434cb9d4b23ee"
SRC_URI[sha256sum] = "baf4665f18d5a60ca04877fdb252a6d64569af105d7faf2331c26eaef0f24bc9"


S = "${WORKDIR}/${SETNAME}/${SRCNAME}"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/${SRCNAME}-${PV}/* ${WORKDIR}/${SETNAME}/${SRCNAME}/.
}
