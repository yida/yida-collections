DESCRIPTION = "The basic geometric and math libraries used in ros."
HOMEPAGE = "http://ros.org/wiki/geometry?distro=fuerte"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"
PR = "r0"

SETV = "1.8.2"

inherit stacks

SRC_URI = "https://code.ros.org/svn/release/download/stacks/geometry/geometry-1.8.2/geometry-1.8.2.tar.bz2 \
           file://BSD-Willow.txt"

SRC_URI[md5sum] = "1f0bc6a49ea5384e19002f9c4c86ef4b"
SRC_URI[sha256sum] = "e9188dac673ab33ae528993baaceb78cc13b857aa434e89636aae785265227e5"

SETNAME = "geometry-${SETV}"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/${SETNAME} ${WORKDIR}/source/.
}
