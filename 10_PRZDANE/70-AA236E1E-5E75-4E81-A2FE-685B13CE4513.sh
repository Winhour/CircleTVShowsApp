#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Tamtej nocy film krótkometrażowy Polska 2018 ^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/70-AA236E1E-5E75-4E81-A2FE-685B13CE4513 Ale_kino+ 23-55 TAMTEJ 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/70-AA236E1E-5E75-4E81-A2FE-685B13CE4513_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/70-AA236E1E-5E75-4E81-A2FE-685B13CE4513_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/70-AA236E1E-5E75-4E81-A2FE-685B13CE4513_URL.sh" \
   --button=gtk-quit\:1 &
