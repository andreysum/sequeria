# Sequeria

## Краткое описание
Расширяет функциональность среды в части генерации последовательностей и работы мультикурсора.

## Интеграция
Создает новый пункт меню в группе "Generate" (Alt + Insert)

## Автоматически распознаваемые шаблоны
Сканируя текщую строчку кода, Sequeria способна работать со следующими шаблонами последовательностей:
 * числовая `1` - `1, 2, 3, 4`, `77` - `77, 78, 79, 80, 81`;
 * числовая, словестная `one` - `one, two, three, four`, `first` - `first, second, third, fourth`;
 * буквенная `a` - `a, b, c, d, e`, `Г` - `Г, Д, Е, Ж, З`;
 * календарная `янв` - `янв, фев, мар, апр`, `january` - `january, february, march, april`;
