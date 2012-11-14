DESCRIPTION = "ROS driver for devices supporting the IEEE 1394 Digital Camera (IIDC) protocol."
HOMEPAGE = "http://www.ros.org/wiki/camera1394"
LICENSE = "BSD,LGPL"
LIC_FILES_CHKSUM = "file://../BSD-Willow.txt;md5=1a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "libdc1394 ros-fuerte-gumstix"
SRCREV = "40248"
PR = "r0"

SRC_URI = "svn://code.ros.org/svn/ros-pkg/stacks/camera1394;module=trunk;proto=https \
           file://BSD-Willow.txt"

S = "${WORKDIR}/camera1394"


inherit cmake

export ROS_ROOT = "${STAGING_DIR_HOST}/opt/ros/fuerte/share/ros"
export ROS_PACKAGE_PATH = "${STAGING_DIR_NATIVE}/opt/ros/fuerte/share:${WORKDIR}:${STAGING_DIR_HOST}/opt/ros/fuerte/share:${STAGING_DIR_HOST}/opt/ros/fuerte/stacks"
export ROSLISP_PACKAGE_DIRECTORY = "${STAGING_DIR_HOST}/opt/ros/fuerte/share/common-lisp/ros"
export ROS_DISTRO = "fuerte"
export ROS_ETC_DIR = "${STAGING_DIR_HOST}/opt/ros/fuerte/etc/ros"
export PYTHONPATH = "${STAGING_DIR_HOST}/opt/ros/fuerte/lib/python2.7/site-packages"
PATH =+ "${STAGING_DIR_NATIVE}/opt/ros/fuerte/bin:"
export CMAKE_PREFIX_PATH="${STAGING_DIR_HOST}/opt/ros/fuerte/share/catkin/cmake/Modules:${STAGING_DIR_HOST}/opt/ros/fuerte"
export LD_LIBRARY_PATH = "${STAGING_DIR_NATIVE}/opt/ros/fuerte/lib"
PKG_CONFIG_PATH=+":${STAGING_DIR_HOST}/opt/ros/fuerte/lib/pkgconfig"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/trunk/* ${WORKDIR}/camera1394/.
  rospack list
}
