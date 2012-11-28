DESCRIPTION = "C++ implementation of bond, a mechanism for checking when another process has terminated."
HOMEPAGE = "http://ros.org/wiki/bondcpp"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"

SETV = "1.6.3"

inherit stacks

SRC_URI = "https://code.ros.org/svn/release/download/stacks/bond_core/bond_core-1.6.3/bond_core-1.6.3.tar.bz2 \
           file://BSD-Willow.txt"
SRC_URI[md5sum] = "46095772faa1c42e30a8d7339cd1ea2f"
SRC_URI[sha256sum] = "91beefd6960d31d3f9b992aea4e3b6c7cfb8598abb4ecaa48c4d3dddb1885ec4"

SETNAME = "bond_core"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/${SETNAME}-${SETV}/* ${WORKDIR}/source/${SETNAME}/.
}
