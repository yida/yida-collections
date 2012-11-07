DESCRIPTION = "Standalone Python library for the ROS package system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"

DEPENDS = ""
PR = "r0"
PV = "1.0.12"


SRC_URI = "git://github.com/ros/rospkg.git;protocol=git;tag=${PV} \
           file://BSD-Willow.txt "

S = "${WORKDIR}/git"

inherit setuptools native

DISTUTILS_INSTALL_ARGS = "--root=${D} \
        --prefix=${prefix} \
        --install-lib=${PYTHON_SITEPACKAGES_DIR} \
        --install-data=${datadir}"

