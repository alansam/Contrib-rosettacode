#!/usr/bin/env rexx
/* Rexx */
-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
--  © Copyright Alan Sampson 2026
-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8

-- Unicode box drawing characters:
-- U+2501 UTF-8: 0xE2 0x94 0x81 ━ Box Drawings Heavy Horizontal
-- U+2533 UTF-8: 0xE2 0x94 0xB3 ┳ Box Drawings Heavy Down and Horizontal
-- U+2503 UTF-8: 0xE2 0x94 0x83 ┃ Box Drawings Heavy Vertical[
-- U+254B UTF-8: 0xE2 0x95 0x8B ╋ Box Drawings Heavy Vertical and Horizontal
-- U+@%#B UTF-8: 0xE2 0x94 0xBB ┻ Box Drawings Heavy Up and Horizontal
-- U+252C UTF-8: 0xE2 0x94 0xAC ┬ Box Drawings Light Down and Horizontal
-- U+253C UTF-8: 0xE2 0x94 0xBC ┼ Box Drawings Light Vertical and Horizontal
-- U+2502 UTF-8: 0xE2 0x94 0x82 │ Box Drawings Light Vertical
-- U+2534 UTF-8: 0xE2 0x94 0xB4 ┴ Box Drawings Light Up and Horizontal
-- U+2500 UTF-8: 0xE2 0x94 0x80 ─ Box Drawings Light Horizontal

bxh = 'E2 94 80'x -- hrizontal
bxv = 'E2 94 82'x -- vertical
bxt = 'E2 94 AC'x -- down tee
bxx = 'E2 94 BC'x -- cross
bxu = 'E2 94 B4'x -- up tee

-- program argument sets max. bound of table. Defaults to 12
parse arg base .
if base~length = 0 then
  base = 12

a_base = .Array~new(base)
say 'tables 1 to' a_base~size

loop _x = 1 to a_base~size
  a_base[_x] = _x
end _x

say bxh~copies(5) || bxt || bxh~copies(base * 4 + 2)
say '+'~right(4) bxv fmtString(a_base)
say bxh~copies(5) || bxx || bxh~copies(base * 4 + 2)

loop _x = 1 to base
  ax = a_base~makearray

  loop _v = ax~size to 1 by -1
    if _v <= _x then do
      ax[_v] = ax[_v] * _x
    end
    else do
      ax~delete(_v)
    end
  end _v
  say _x~right(4) bxv fmtString(ax)
end _x
say bxh~copies(5) || bxu || bxh~copies(base * 4 + 2)
say

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
fmtString: procedure
  use arg strng

  fmt_str = ''
  loop itm over strng
    fmt_str = fmt_str || itm~right(4)
  end itm

  return fmt_str~strip('t')

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8

