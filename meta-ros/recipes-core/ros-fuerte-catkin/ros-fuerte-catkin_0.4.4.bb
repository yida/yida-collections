DESCRIPTION = "Willow Garage low-level build system macros and infrastructure"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"

DEPENDS = "python-empy-native python-pyyaml-native python-nose-native rospkg-native gtest"
PR = "r0"
PV = "0.4.4"

inherit cmake

SRC_URI = "git://github.com/ros/catkin.git;protocol=git;tag=${PV} \
           file://BSD-Willow.txt \
           file://0001-iIgnore-CMAKE_FIND_ROOT_PATH-when-searching-for-chec.patch \
           file://0002-Use-CMAKE_FIND_ROOT_PATH-when-searching-for-include-.patch"

S = "${WORKDIR}/git"

EXTRA_OECMAKE = "'-DCMAKE_INSTALL_PREFIX=/opt/ros/fuerte' '-DSETUPTOOLS_DEB_LAYOUT=OFF'"

export STAGING_LIBDIR
export STAGING_INCDIR

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
