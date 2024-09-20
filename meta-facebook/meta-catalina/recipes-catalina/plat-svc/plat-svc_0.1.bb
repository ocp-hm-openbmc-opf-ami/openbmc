LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit allarch systemd obmc-phosphor-systemd

RDEPENDS:${PN} += "bash"
RDEPENDS:${PN} += "libgpiod-tools"
RDEPENDS:${PN} += "fb-common-functions"

SRC_URI += " \
    file://catalina-sys-init.service \
    file://catalina-early-sys-init \
    file://standby-power-enable \
    "

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE:${PN}:append = " \
    catalina-sys-init.service \
    "

do_install() {
    CATALINA_LIBEXECDIR="${D}${libexecdir}/catalina"
    install -d ${CATALINA_LIBEXECDIR}
    install -m 0755 ${WORKDIR}/catalina-early-sys-init ${CATALINA_LIBEXECDIR}
    install -m 0755 ${WORKDIR}/standby-power-enable ${CATALINA_LIBEXECDIR}
}
