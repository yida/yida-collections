require image_common.inc

DESCRIPTION = "This package provides a C++ interface for camera calibration information"
HOMEPAGE = "http://www.ros.org/wiki/camera_info_manager?distro=fuerte"
DEPENDS += "ros-fuerte-camera-calibration-parsers"
PR = "r2"

SRCNAME="camera_info_manager"

S = "${WORKDIR}/image_common/${SRCNAME}"


inherit cmake

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

ROS_PACKAGE_PATH =+ "${WORKDIR}/image_common:"
ROS_STACKS_INSTALL_PREFIX = "${D}/${LOCAL_STACKS_PREFIX}"

do_install() {
  install -d ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/bin
  install -m 0755 ${S}/bin/* ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/bin

  install -d ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/lib
  install -m 0755 ${S}/lib/* ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/lib

  install -d ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/include/${SRCNAME}
  install -m 0644 ${S}/include/${SRCNAME}/* ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/include/${SRCNAME}

  install -d ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/src
  install -m 0644 ${S}/src/* ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/src

  touch ${S}/ROS_NOBUILD
  install -m 0644 ${S}/ROS_NOBUILD ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/ROS_NOBUILD
  install -m 0644 ${S}/CMakeLists.txt ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/CMakeLists.txt
  install -m 0644 ${S}/mainpage.dox ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/mainpage.dox
  install -m 0644 ${S}/manifest.xml ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/manifest.xml
  install -m 0644 ${S}/../Makefile ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/Makefile
  
}

sysroot_stage_dirs_append() {
  sysroot_stage_dir $from/home $to/home
}


FILES_${PN} = "/home/root/ros/*"

