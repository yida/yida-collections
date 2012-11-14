#DESCRIPTION = "rospack is a command-line tool for retrieving information about ROS packages available on the filesystem"

VER_rospack = "2.0.13"

SRC_URI += "git://github.com/wg-debs/rospack-release.git;destsuffix=rospack;name=rospack"
SRCREV_rospack = "debian/ros-fuerte-rospack_${VER_rospack}_lucid" 

