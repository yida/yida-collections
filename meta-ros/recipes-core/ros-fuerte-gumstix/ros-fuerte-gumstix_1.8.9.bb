DESCRIPTION = "ROS for Gumstix"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"

DEPENDS = "python-empy python-pyyaml python-nose rospkg gtest log4cxx"
PR = "r1"
PV = "1.8.9"


SRC_URI = "file://BSD-Willow.txt \
           file://CMakeLists.txt"

S = "${WORKDIR}"

inherit cmake

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

