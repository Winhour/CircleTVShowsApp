#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "W doborowym towarzystwie komediodramat USA 2004 ^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/18-F58FA0F6-EE2A-48A4-BDF9-1717756DB821 CBS_Europa_HD 18-55 W 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/18-F58FA0F6-EE2A-48A4-BDF9-1717756DB821_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/18-F58FA0F6-EE2A-48A4-BDF9-1717756DB821_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/18-F58FA0F6-EE2A-48A4-BDF9-1717756DB821_URL.sh" \
   --button=gtk-quit\:1 &
