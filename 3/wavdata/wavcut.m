list = dir('*.wav');
for i = 1 : length(list)
  filename = list(i).name;
  [y, fs] = audioread(filename);
  audiowrite(filename, y(1:fs, 1), fs);
end
