DESCRIPTION = "This package provides a class to facilitate dynamic node reconfiguration."
HOMEPAGE = "http://www.ros.org/wiki/dynamic_reconfigure"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"

SRCREV = ""
PR = "r3"
SETNAME = ""
SRCNAME="dynamic_reconfigure"

inherit stacks 

SRC_URI = "https://code.ros.org/svn/release/download/stacks/dynamic_reconfigure/dynamic_reconfigure-1.4.2/dynamic_reconfigure-${PV}.tar.bz2 \
           file://BSD-Willow.txt"
SRC_URI[md5sum] = "a74cb548298d9d9f3a3e9037d52fb02d"
SRC_URI[sha256sum] = "00040ea14e5334cfefb8274f6a4716892098f7cfba045ece7af32094754767ec"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/${SRCNAME}-${PV}/* ${WORKDIR}/source/${SETNAME}/${SRCNAME}/.
}

do_install_append() {
  stacks_do_file_install catkin.cmake
  stacks_do_file_install epydoc.config
  stacks_do_file_install rosbuild.cmake
  stacks_do_file_install setup.py
}
