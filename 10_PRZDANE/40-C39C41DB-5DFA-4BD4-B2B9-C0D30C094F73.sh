#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Lot dramat obyczajowy USA 2012 ^^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/40-C39C41DB-5DFA-4BD4-B2B9-C0D30C094F73 POLSAT_Film 21-00 LOT 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/40-C39C41DB-5DFA-4BD4-B2B9-C0D30C094F73_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/40-C39C41DB-5DFA-4BD4-B2B9-C0D30C094F73_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/40-C39C41DB-5DFA-4BD4-B2B9-C0D30C094F73_URL.sh" \
   --button=gtk-quit\:1 &
