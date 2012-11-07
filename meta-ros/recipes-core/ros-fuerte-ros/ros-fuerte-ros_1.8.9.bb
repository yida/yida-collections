DESCRIPTION = "ROS packaging system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE/roscheck/BSD-Stanford-Morgan.txt;md5=50270256bf12dbb02f316ee599922060; \
                    file://LICENSE/roscheck/BSD-Willow-2009.txt;md5=094989d05a40b5016161674bd28983e3; \
                    file://LICENSE/roscheck/BSD-Willow-Morgan.txt;md5=37c3e1fe4b90009ffca9d42b0135a5bb; \
                    file://LICENSE/roscheck/BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"

DEPENDS = "python-empy-native python-pyyaml-native python-nose-native rospkg-native gtest \
           ros-fuerte-catkin \
           ros-fuerte-rospack"
PR = "r0"
PV = "ros-fuerte-ros_1.8.9_lucid"

inherit cmake

SRC_URI = "git://github.com/wg-debs/ros-release.git;protocol=git;tag=${PV}"

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

