list = dir('*.wav');
for i = 1 : length(list)
  filename = list(i).name;
  [y, fs] = wavread(filename);
  wavwrite(y(1:fs, 1), fs, filename);
end
