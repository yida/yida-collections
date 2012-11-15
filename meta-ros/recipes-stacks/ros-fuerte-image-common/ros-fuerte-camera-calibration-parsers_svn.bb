require image_common.inc

DESCRIPTION = "camera_calibration_parsers contains routines for reading and writing camera calibration parameters"
HOMEPAGE = "http://www.ros.org/wiki/camera_info_manager?distro=fuerte"
DEPENDS += "yaml-cpp"
PR = "r7"

SRCNAME="camera_calibration_parsers"


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


