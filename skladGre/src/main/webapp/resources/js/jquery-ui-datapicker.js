$(document).ready(
		function() {

			$.datepicker.regional['cs'] = {
				closeText : 'Cerrar',
				prevText : 'P�edchoz�',
				nextText : 'Dal��',
				currentText : 'Hoy',
				monthNames : [ 'Leden', '�nor', 'B�ezen', 'Duben', 'Kv�ten',
						'�erven', '�ervenec', 'Srpen', 'Z���', '��jen',
						'Listopad', 'Prosinec' ],
				monthNamesShort : [ 'Le', '�n', 'B�', 'Du', 'Kv', '�n', '�c',
						'Sr', 'Z�', '��', 'Li', 'Pr' ],
				dayNames : [ 'Ned�le', 'Pond�l�', '�ter�', 'St�eda', '�tvrtek',
						'P�tek', 'Sobota' ],
				dayNamesShort : [ 'Ne', 'Po', '�t', 'St', '�t', 'P�', 'So', ],
				dayNamesMin : [ 'Ne', 'Po', '�t', 'St', '�t', 'P�', 'So' ],
				weekHeader : 'Sm',
				dateFormat : 'dd.mm.yy',
				firstDay : 1,
				isRTL : false,
				showMonthAfterYear : false,
				yearSuffix : ''
			};

			$.datepicker.setDefaults($.datepicker.regional['cs']);

			$("#datepicker").datepicker();
		});