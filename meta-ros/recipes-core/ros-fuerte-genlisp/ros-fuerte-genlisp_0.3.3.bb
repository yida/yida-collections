DESCRIPTION = "ROS packaging system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"

DEPENDS = "python-empy-native python-pyyaml-native python-nose-native rospkg-native gtest \
           ros-fuerte-catkin \
           ros-fuerte-genmsg "
PR = "r0"
PV = "0.3.3"

inherit cmake

SRC_URI = "git://github.com/wg-debs/genlisp-release.git;protocol=git;tag=debian/ros-fuerte-genlisp_${PV}_lucid \
           file://BSD-Willow.txt "

S = "${WORKDIR}/git"

EXTRA_OECMAKE = "'-DCMAKE_INSTALL_PREFIX=/opt/ros/fuerte' '-DSETUPTOOLS_DEB_LAYOUT=OFF'"

export STAGING_LIBDIR
export STAGING_INCDIR

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

do_compile_prepend() {
      export BUILD_SYS="${BUILD_SYS}"
      export HOST_SYS="${HOST_SYS}"
}

do_install_prepend() {
      export BUILD_SYS="${BUILD_SYS}"
      export HOST_SYS="${HOST_SYS}"
}

sysroot_stage_dirs_append() {
  sysroot_stage_dir $from/opt $to/opt
}

FILES_${PN} = "/opt/ros/fuerte/*"

