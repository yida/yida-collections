LOCAL_STACKS_PREFIX = "/home/root/ros"

inherit cmake

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

S = "${WORKDIR}/source/${SETNAME}/${SRCNAME}"

export ROS_ROOT = "${STAGING_DIR_HOST}/opt/ros/fuerte/share/ros"
export ROS_PACKAGE_PATH = "${STAGING_DIR_HOST}/${LOCAL_STACKS_PREFIX}:${STAGING_DIR_NATIVE}/opt/ros/fuerte/share:${WORKDIR}/source:${STAGING_DIR_HOST}/opt/ros/fuerte/share:${STAGING_DIR_HOST}/opt/ros/fuerte/stacks"
export ROSLISP_PACKAGE_DIRECTORY = "${STAGING_DIR_HOST}/opt/ros/fuerte/share/common-lisp/ros"
export ROS_DISTRO = "fuerte"
export ROS_ETC_DIR = "${STAGING_DIR_HOST}/opt/ros/fuerte/etc/ros"
export PYTHONPATH = "${STAGING_DIR_HOST}/opt/ros/fuerte/lib/python2.7/site-packages"
PATH =+ "${STAGING_DIR_NATIVE}/opt/ros/fuerte/bin:${STAGING_DIR_HOST}/opt/ros/fuerte/bin:"
export CMAKE_PREFIX_PATH="${STAGING_DIR_HOST}/opt/ros/fuerte/share/catkin/cmake/Modules:${STAGING_DIR_HOST}/opt/ros/fuerte"
export LD_LIBRARY_PATH = "${STAGING_DIR_NATIVE}/opt/ros/fuerte/lib"
PKG_CONFIG_PATH=+":${STAGING_DIR_HOST}/opt/ros/fuerte/lib/pkgconfig"

ROS_PACKAGE_PATH += "${WORKDIR}/source/${SETNAME}:"
ROS_STACKS_INSTALL_PREFIX = "${D}/${LOCAL_STACKS_PREFIX}"


sysroot_stage_dirs_append() {
  sysroot_stage_dir $from/home $to/home
}


FILES_${PN} = "/home/root/ros/*"

stacks_do_folder_install() {
  foldername="$1"
  if [ -d ${S}/${foldername} ]; then
    install -d ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/${foldername}
    cp -rf ${S}/${foldername} ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/.
  fi
}

stacks_do_file_install() {
  filename="$1"
  if [ -e ${S}/${filename} ]; then
    cp -f ${S}/${filename} ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/.
  fi
}

do_install() {
  stacks_do_folder_install bin
  stacks_do_folder_install lib
  stacks_do_folder_install include
  stacks_do_folder_install src
  stacks_do_folder_install tests
  stacks_do_folder_install cfg
  stacks_do_folder_install cmake
  stacks_do_folder_install msg
  stacks_do_folder_install msg_gen
  stacks_do_folder_install srv
  stacks_do_folder_install srv_gen
  stacks_do_folder_install scripts
  stacks_do_folder_install src
  stacks_do_folder_install templates
  stacks_do_folder_install test
  

  touch ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/ROS_NOBUILD

  stacks_do_file_install CMakeLists.txt
  stacks_do_file_install mainpage.dox
  stacks_do_file_install manifest.xml
  stacks_do_file_install stack.xml
  stacks_do_file_install stack.yaml
  stacks_do_file_install rosdoc.yaml

  echo 'include $(shell rospack find mk)/cmake.mk' > ${ROS_STACKS_INSTALL_PREFIX}/${SRCNAME}/Makefile
   
}





