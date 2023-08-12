SUMMARY = "OpenBMC VNC server and ipKVM daemon"
DESCRIPTION = "obmc-ikvm is a vncserver for JPEG-serving V4L2 devices to allow ipKVM"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=75859989545e37968a99b631ef42722e"
DEPENDS = " libvncserver systemd sdbusplus phosphor-logging phosphor-dbus-interfaces"
SRCREV = "3c110335bd170a4b5ae6c591d3201c1ab7b03b00"
PV = "1.0+git${SRCPV}"

SRC_URI = "git://github.com/openbmc/obmc-ikvm;branch=master;protocol=https"

SYSTEMD_SERVICE:${PN} += "start-ipkvm.service"
S = "${WORKDIR}/git"

inherit pkgconfig meson systemd
