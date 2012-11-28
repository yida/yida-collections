DESCRIPTION = "Nodelets library and tools. Nodelets are a plugin architecture for roscpp that enable dynamic loading of multiple 'nodelets' into a single ROS node instance."
HOMEPAGE = "http://www.ros.org/wiki/nodelet_core?distro=fuerte"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"
PR = "r2"

SETV = "1.6.5"

inherit stacks

SRC_URI = "https://code.ros.org/svn/release/download/stacks/nodelet_core/nodelet_core-1.6.5/nodelet_core-1.6.5.tar.bz2 \
           file://BSD-Willow.txt"

SRC_URI[md5sum] = "81dd5d80cdb37c73597bdab055dadf02"
SRC_URI[sha256sum] = "143bc0ca5fcf8e1a34b1f8f9ccf7a44f63579d5fbf2ec6ca7c4b1598520bfa2e"

SETNAME = "nodelet_core-${SETV}"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/${SETNAME} ${WORKDIR}/source/.
}
